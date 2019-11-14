import React from 'react'
import Box from '@material-ui/core/Box';

class MovieRow extends React.Component {
  viewMovie() {
    // console.log("Trying to view movie")
    // console.log(this.props.movie.title)
    const url = "https://www.themoviedb.org/movie/" + this.props.movie.id
    window.location.href = url
  }

  render() {
    return    <div style={{ width: '100%' }}>
    <Box component="span" display="block" p={1} m={1} bgcolor="background.paper">
    <Box component="span" m={1}>
    <table key={this.props.movie.id}>
    <tbody>
      <tr>
        <td>
          <img alt="poster" style={{"padding-right": "12px"}} width="190" src={this.props.movie.poster_src}/>
        </td>
        <td>
          <h3>{this.props.movie.title}</h3>
          <p>{this.props.movie.overview}</p>
          <input type="button" onClick={this.viewMovie.bind(this)} value="View"/>
        </td>
      </tr>
    </tbody>
  </table>
  </Box>
    </Box>
    
  </div>
  
  
  }
}

export default MovieRow